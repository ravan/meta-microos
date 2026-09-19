SUMMARY = "Translations for package libfm-qt5"
DESCRIPTION = "Provides translations for the 'libfm-qt5' package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libfm-qt5-lang-1.4.0-1.13.noarch.rpm"
RPM_HASH = "ef7b050ca59fb723f29bf4ca1f2e6fc8dc3b0447d6f396e005407eb6d3daa36985c85c2a5883227feb9fe52957f64094c610df371205886756dc6eed62c2dce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt5-lang \
libfm-qt5-lang-all"

RDEPENDS:${PN} += "libfm-qt5"

inherit rpm
