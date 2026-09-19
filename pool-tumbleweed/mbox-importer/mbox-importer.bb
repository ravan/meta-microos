SUMMARY = "Tool for importing mbox archives into akonadi"
DESCRIPTION = "This package contains a tool that can be used to import mbox archives \
into akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mbox-importer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9a040ba086000e684096ec2a052e7a2680844e0bdf5f94356e2060c2eafdf179dffddece66ab0c2ebd59f68e9ad5a8d953ebd4e789436479b90b15dfd844d032"

RPROVIDES:${PN} += "mbox-importer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailImporter.so.6 \
libKPim6MailImporterAkonadi.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
