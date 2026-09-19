SUMMARY = "A pure-Python implementation of RFC 8785"
DESCRIPTION = "A pure-Python, no-dependency implementation of RFC 8785, a.k.a. JSON \
Canonicalization Scheme or JCS. \
 \
This implementation should be behaviorally comparable to Andrew \
Rundgren's reference implementation, with the following added \
constraints: \
 \
1. This implementation does not transparently convert non-`str` \
   dictionary keys into strings. Users must explicitly perform this \
   conversion. \
2. No support for indentation, pretty-printing, etc. is provided. The \
   output is always minimally encoded. \
3. All APIs produce UTF-8-encoded `bytes` objects or `bytes` I/O."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python314-rfc8785-0.1.4-1.7.noarch.rpm"
RPM_HASH = "a5a0afcae165cb4f56e24184d967d51d053b4a210aa356ca82dcccba42f2c38800ee699869d12a8ce78d58913038c2eb7e7fd3e411d25eba6fd1d64ebc596165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rfc8785 \
python314-rfc8785 \
python3dist-rfc8785"

RDEPENDS:${PN} += "python-abi"

inherit rpm
