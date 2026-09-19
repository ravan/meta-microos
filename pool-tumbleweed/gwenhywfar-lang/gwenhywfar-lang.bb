SUMMARY = "Translations for package gwenhywfar"
DESCRIPTION = "Provides translations for the 'gwenhywfar' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-lang-5.14.1-1.3.noarch.rpm"
RPM_HASH = "c350fad5daed3900c137d7a2aa493a57714317a169e376ccea7cc8adff7c49bb93efb12d637f6292ab3c0e498717712afb51ff2b3613830b38f21e94654c7f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gwenhywfar-lang \
gwenhywfar-lang-all \
locale-gwenhywfar-de"

RDEPENDS:${PN} += "gwenhywfar"

inherit rpm
