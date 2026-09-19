SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python314-poetry-plugin-export-1.10.0-1.2.noarch.rpm"
RPM_HASH = "39882bb6797b715dc27ae2da6a46f7666b705c1414d76924e2ef8c790881662f5ac04e557f1c633f2bf9a8cca08999889d1f5e2b1e8dce6b99b3435ba0e89956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-poetry-plugin-export \
python314-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "-python314-poetry >= 2.1.0 with python314-poetry < 3 \
-python314-poetry-core >= 2.1.0 with python314-poetry-core < 3 \
python-abi \
python314-tomlkit"

inherit rpm
