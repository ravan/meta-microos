SUMMARY = "StatusNotifierItem tray icon plugin for Pidgin"
DESCRIPTION = "This plugin provides a StatusNotifierItem tray icon, for use in \
MATE, KDE Plasma 5, Elementary Pantheon and other environments. \
 \
It provides all the same functionality as the original tray icon \
but not in exactly the same way: \
 * The 'smart' click behaviour that either shows the buddy list or \
   unread messages is now activated by a middle-click – because \
   left click on an libappindicator always opens the menu. \
 * As the SNI-icon is a separate process from pidgin itself, there \
   are sometimes conflicts with Focus Stealing Prevention when you \
   use the indicator to go to unread messages. You may need to \
   disable FSP for Pidgin to get around this. \
 * Due to how libayatana-appindicator work, the middle-click action \
   must also be a menu item, so it's the new Show/Hide item at the \
   top of the menu. \
 * Due to libayatana-appindicator limitations, some of the special \
   icons can't be shown next to menu items any more."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "pidgin-plugin-indicator-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "33eabac1ec2cbcbe4ea3b5a788363deac08f4ce99ab81e15a2b39d17a76d8b4feb5dc7f79e51157a0ed80a763ec9dde773ae856f374272be45fc59ec59a48a0c"

RPROVIDES:${PN} += "pidgin-indicator \
pidgin-plugin-indicator"

RDEPENDS:${PN} += "libappindicator3.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
