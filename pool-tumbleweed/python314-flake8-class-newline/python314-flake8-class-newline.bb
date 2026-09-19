SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-flake8-class-newline-1.6.0-3.5.noarch.rpm"
RPM_HASH = "0355388877c6dbc1cba7da7e164df714e2ecba91d2801c0ee452e9b5e91f8e54d1e38640643e34debdb9781ec5c01066fd2687da534a6b64c10c8df2af73db1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-class-newline \
python314-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
