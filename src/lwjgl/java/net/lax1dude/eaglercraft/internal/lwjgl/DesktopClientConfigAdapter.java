package net.lax1dude.eaglercraft.internal.lwjgl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import net.lax1dude.eaglercraft.EaglercraftVersion;
import net.lax1dude.eaglercraft.internal.IClientConfigAdapter;
import net.lax1dude.eaglercraft.internal.IClientConfigAdapterHooks;

/**
 * Copyright (c) 2022 lax1dude. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class DesktopClientConfigAdapter implements IClientConfigAdapter {

	public static final IClientConfigAdapter instance = new DesktopClientConfigAdapter();

	public final List<DefaultServer> defaultServers = new ArrayList<>();

	private final DesktopClientConfigAdapterHooks hooks = new DesktopClientConfigAdapterHooks();

	@Override
	public String getDefaultLocale() {
		return "en_US";
	}

	@Override
	public List<DefaultServer> getDefaultServerList() {
		return defaultServers;
	}

	@Override
	public String getServerToJoin() {
		return null;
	}

	@Override
	public String getWorldsDB() {
		return "worlds";
	}

	@Override
	public String getResourcePacksDB() {
		return "resourcePacks";
	}

	@Override
	public boolean isCheckGLErrors() {
		return false;
	}

	@Override
	public boolean isCheckShaderGLErrors() {
		return false;
	}

	@Override
	public boolean isDemo() {
		return EaglercraftVersion.forceDemoMode;
	}

	@Override
	public boolean allowUpdateSvc() {
		return false;
	}

	@Override
	public boolean allowUpdateDL() {
		return false;
	}

	@Override
	public boolean isEnableDownloadOfflineButton() {
		return false;
	}

	@Override
	public String getDownloadOfflineButtonLink() {
		return null;
	}

	@Override
	public boolean useSpecialCursors() {
		return false;
	}

	@Override
	public boolean isLogInvalidCerts() {
		return false;
	}

	@Override
	public boolean isCheckRelaysForUpdates() {
		return false;
	}

	@Override
	public boolean isEnableSignatureBadge() {
		return false;
	}

	@Override
	public boolean isAllowVoiceClient() {
		return false;
	}

	@Override
	public boolean isAllowFNAWSkins() {
		return true;
	}

	@Override
	public String getLocalStorageNamespace() {
		return EaglercraftVersion.localStorageNamespace;
	}

	@Override
	public boolean isEnableMinceraft() {
		return true;
	}

	@Override
	public boolean isEnableServerCookies() {
		return true;
	}

	@Override
	public boolean isAllowServerRedirects() {
		return true;
	}

	@Override
	public boolean isOpenDebugConsoleOnLaunch() {
		return false;
	}

	@Override
	public boolean isForceWebViewSupport() {
		return false;
	}

	@Override
	public boolean isEnableWebViewCSP() {
		return true;
	}

	@Override
	public boolean isAllowBootMenu() {
		return false;
	}

	@Override
	public boolean isForceProfanityFilter() {
		return false;
	}

	@Override
	public boolean isEaglerNoDelay() {
		return false;
	}

	@Override
	public boolean isRamdiskMode() {
		return false;
	}

	@Override
	public boolean isEnforceVSync() {
		return false;
	}

	@Override
	public IClientConfigAdapterHooks getHooks() {
		return hooks;
	}

	private static class DesktopClientConfigAdapterHooks implements IClientConfigAdapterHooks {

		@Override
		public void callLocalStorageSavedHook(String key, String base64) {

		}

		@Override
		public String callLocalStorageLoadHook(String key) {
			return null;
		}

		@Override
		public void callCrashReportHook(String crashReport, Consumer<String> customMessageCB) {

		}

		@Override
		public void callScreenChangedHook(String screenName, int scaledWidth, int scaledHeight, int realWidth,
				int realHeight, int scaleFactor) {

		}

	}

}