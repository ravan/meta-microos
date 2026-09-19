SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "Localization library for expressive translations."
LICENSE = "Apache-2.0"

PV = "0.19.0"

RPM_NAME = "python314-fluent.syntax-0.19.0-2.5.noarch.rpm"
RPM_HASH = "957d03b9a2ccf75c634e5f1b386b9eefe4709aa2ef73ae2d989ce0bd25e393b94b14de792d037f036ec47c514e3d3e1ca741c0d7898dd0599c568873c0315092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fluent.syntax \
python314-fluent \
python314-fluent.syntax \
python3dist-fluent.syntax"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
