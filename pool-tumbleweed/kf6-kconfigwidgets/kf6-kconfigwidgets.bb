SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kconfigwidgets-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7f416c412a9bfc64c04bd34d4d2aa75f69b9b074d9fcc9d18c511f4406a09b7468a28fbf6241aa2435061fb02acb9abdf151891f4c400abe3c6df1a5613e9dfd"

RPROVIDES:${PN} += "kf6-kconfigwidgets"

RDEPENDS:${PN} += ""

inherit rpm
