SUMMARY = "A pytest plugin that allows you recording of network interactions via VCRpy"
DESCRIPTION = "A pytest plugin that records network interactions in your tests \
via VCR.py. \
 \
Features \
 * Straightforward `pytest.mark.vcr`, that reflects \
   `VCR.use_cassettes` API; \
 * Combining multiple VCR cassettes \
 * Network access blocking; \
 * The `rewrite` recording mode that rewrites cassettes \
   from scratch."
LICENSE = "MIT"

PV = "0.13.4"

RPM_NAME = "python313-pytest-recording-0.13.4-1.4.noarch.rpm"
RPM_HASH = "ef128dcf1136342247f4e4edd28a0fd914aa2684b5b38d9eb9eaebd5eba71c7399aa620bb096e6b71861ba284934bd8433ab37bb859fbb02d1f5fef6303a9971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-recording \
python3.13dist-pytest-recording \
python313-pytest-recording \
python3dist-pytest-recording"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-vcrpy"

inherit rpm
