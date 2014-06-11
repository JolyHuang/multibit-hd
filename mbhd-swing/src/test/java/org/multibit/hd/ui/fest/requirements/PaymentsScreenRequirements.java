package org.multibit.hd.ui.fest.requirements;

import com.google.common.collect.Maps;
import org.fest.swing.fixture.FrameFixture;
import org.multibit.hd.ui.fest.use_cases.contacts.*;
import org.multibit.hd.ui.fest.use_cases.payments.ShowPaymentsScreenUseCase;

import java.util.Map;

/**
 * <p>FEST Swing UI test to provide:</p>
 * <ul>
 * <li>Exercise the "contacts" screen to verify its wizards show correctly</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class PaymentsScreenRequirements {

  public static void verifyUsing(FrameFixture window) {

    Map<String,Object> parameters = Maps.newHashMap();

    // Select the contacts screen
    new ShowPaymentsScreenUseCase(window).execute(parameters);

    // Search for some entries
    new SearchContactUseCase(window).execute(parameters);

  }
}