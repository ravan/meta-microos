SUMMARY = "The python pandas[output_formatting] extra"
DESCRIPTION = "This package provides the [output_formatting] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-output_formatting-3.0.5-2.2.noarch.rpm"
RPM_HASH = "8205d2661153897a4231782a834a0c80a0e93762104e531fb28d107cc285a9b95bd4a81430c808e57fe2ef37934c0fc930b4d36dca65b63432f16337c50bed4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-output-formatting"

RDEPENDS:${PN} += "python314-Jinja2 \
python314-pandas \
python314-tabulate"

inherit rpm
