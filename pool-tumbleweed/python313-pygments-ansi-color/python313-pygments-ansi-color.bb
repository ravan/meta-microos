SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python313-pygments-ansi-color-0.3.0-2.5.noarch.rpm"
RPM_HASH = "8ef757a4a4080da26f06da64f2ab025db4d42228f8b9614f99d0caccf8b5a2ff131c1d6d4c043d5243bab948acc3f4868c5259d830a0378809b73573e445d037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-ansi-color \
python3.13dist-pygments-ansi-color \
python313-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python313-pygments \
python313-setuptools"

inherit rpm
