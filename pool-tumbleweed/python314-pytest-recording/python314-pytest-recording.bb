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

RPM_NAME = "python314-pytest-recording-0.13.4-1.4.noarch.rpm"
RPM_HASH = "fa0d28a5d4dbcf6e9c330a1b55e3b692cccbecfc0beeb3b2a72027b98e026342e7a226df2a4f20a560db778bcd40045074e55f8bbcdc2eb2314fa1d23d944da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-recording \
python314-pytest-recording \
python3dist-pytest-recording"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-vcrpy"

inherit rpm
