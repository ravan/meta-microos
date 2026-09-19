SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-cauldron-notebook-1.0.9-3.2.noarch.rpm"
RPM_HASH = "7429146f583ff8fd7406eeed5a2b47bf884da5b5b41a852befcbca0764283762df402b9c13cf504bbf68dbcc4a4f8bde600f87fee3bb8eeb77a7f8e58963220e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cauldron-notebook \
python310-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Flask \
python310-Jinja2 \
python310-Markdown \
python310-beautifulsoup4 \
python310-numpy \
python310-pandas \
python310-pygments \
python310-requests \
python310-waitress \
update-alternatives"

inherit rpm
