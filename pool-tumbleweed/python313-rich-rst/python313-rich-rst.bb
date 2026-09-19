SUMMARY = "A beautiful reStructuredText renderer for rich"
DESCRIPTION = "A beautiful and easy to use reStructuredText renderer for the rich \
library, to render RST documents in the terminal."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-rich-rst-2.1.0-1.1.noarch.rpm"
RPM_HASH = "e1f36757026a02f53d55c3bb76af8408d012ebef27c1d51952b9439443bd561c82ff28c02b59180f8a14c56080bc2f1dcea6ff989d44783da22715439b6cc398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-rst \
python3.13dist-rich-rst \
python313-rich-rst \
python3dist-rich-rst"

RDEPENDS:${PN} += "python-abi \
python313-Pygments \
python313-rich"

inherit rpm
