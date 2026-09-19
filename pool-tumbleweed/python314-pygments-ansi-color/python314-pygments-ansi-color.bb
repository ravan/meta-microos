SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python314-pygments-ansi-color-0.3.0-2.5.noarch.rpm"
RPM_HASH = "5ccd9f296a352368f9948b55c404f5c30821eaa58d91f197c5fca8732cfd895138064a040f79791022102608325e3675d5ad10068ab2eb3da47a35c9702cafe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygments-ansi-color \
python314-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python314-pygments \
python314-setuptools"

inherit rpm
