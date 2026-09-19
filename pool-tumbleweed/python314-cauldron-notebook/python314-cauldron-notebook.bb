SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python314-cauldron-notebook-1.0.9-3.9.noarch.rpm"
RPM_HASH = "26191d23ff4b45b75525e054434eb348b6763e706d42cac7f11656a6e833bded03b438b40f3a65b119d22dd2b5300cdbe1a40bd6d539e57206c920c2115764ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cauldron-notebook \
python314-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Flask \
python314-Jinja2 \
python314-Markdown \
python314-beautifulsoup4 \
python314-numpy \
python314-pandas \
python314-pygments \
python314-requests \
python314-waitress \
update-alternatives"

inherit rpm
