SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python314-mizani-0.14.4-1.3.noarch.rpm"
RPM_HASH = "9815553e7ad458f6694d864f736d15497bd6f57d6e434c8eb6632704faa62f60a4d2346f222ca7bfbc26b30620a9033052d91aa81a4f5461de5ffd10e6a4143f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mizani \
python314-mizani \
python3dist-mizani"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-pandas \
python314-scipy"

inherit rpm
