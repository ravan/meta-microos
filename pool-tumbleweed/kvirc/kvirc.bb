SUMMARY = "Graphical Front-End for IRC"
DESCRIPTION = "IRC (Internet Relay Chat) client with an MDI interface; scripting, \
pop-up, alias, and event editor, DCC (SEND CHAT VOICE and RESUME), \
SOCKSV4 & V5 support and more."
LICENSE = "GPL-2.0-or-later & (GPL-3.0-only | SUSE-LGPL-2.1-with-digia-exception-1.1)"

PV = "5.2.10"

RPM_NAME = "kvirc-5.2.10-1.6.aarch64.rpm"
RPM_HASH = "7f503956f44d14a168da6a78ccf7e2ec7044005559376592fa5a77206ec3b12d8c2809dd4b3254e4ba62c72bfaf52a53f453e208b6cb411c0cb0ab4598ac8805"

RPROVIDES:${PN} += "kvirc \
libkviabout.so \
libkviaction.so \
libkviactioneditor.so \
libkviaddon.so \
libkvialiaseditor.so \
libkviavatar.so \
libkvichan.so \
libkvichannelsjoin.so \
libkviclasseditor.so \
libkvicodetester.so \
libkviconfig.so \
libkvicontext.so \
libkvidcc.so \
libkvidialog.so \
libkvieditor.so \
libkvieventeditor.so \
libkvifile.so \
libkvifiletransferwindow.so \
libkvifish.so \
libkvihelp.so \
libkvihttp.so \
libkviident.so \
libkviiograph.so \
libkvilamerizer.so \
libkvilanguage.so \
libkvilib.so.5 \
libkvilinks.so \
libkvilist.so \
libkvilog.so \
libkvilogview.so \
libkvimask.so \
libkvimath.so \
libkvimediaplayer.so \
libkvimircimport.so \
libkvimy.so \
libkvinotifier.so \
libkviobjects.so \
libkvioptions.so \
libkvipackage.so \
libkviperl.so \
libkviperlcore.so \
libkvipopup.so \
libkvipopupeditor.so \
libkviproxydb.so \
libkvipython.so \
libkvipythoncore.so \
libkviraweditor.so \
libkviregchan.so \
libkvireguser.so \
libkvirijndael.so \
libkvirot13.so \
libkviserverdb.so \
libkvisetup.so \
libkvisharedfile.so \
libkvisharedfileswindow.so \
libkvisnd.so \
libkvisocketspy.so \
libkvispaste.so \
libkvispellchecker.so \
libkvistr.so \
libkvisystem.so \
libkviterm.so \
libkvitexticons.so \
libkvitheme.so \
libkvitip.so \
libkvitmphighlight.so \
libkvitoolbar.so \
libkvitoolbareditor.so \
libkvitorrent.so \
libkvitrayicon.so \
libkviupnp.so \
libkviurl.so \
libkviuserlist.so \
libkviwindow.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libperl.so \
libphonon4qt6.so.4 \
libpython3.13.so.1.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
perl \
qt6-sql-sqlite"

inherit rpm
