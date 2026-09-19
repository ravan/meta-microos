SUMMARY = "Translations for package madplay"
DESCRIPTION = "Provides translations for the 'madplay' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "madplay-lang-0.15.2b-3.11.noarch.rpm"
RPM_HASH = "8d392e01683f2ba4ac20c46e6aa55bd6d14cf5019fe4b2dc38c41a1cffa8bcca1498d47fd5c70331c5c403d0c2fe24b94a85122793775f915044ced6c29e5003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-madplay-en \
locale-madplay-es \
locale-madplay-fr \
locale-madplay-hr \
madplay-lang \
madplay-lang-all"

RDEPENDS:${PN} += "madplay"

inherit rpm
