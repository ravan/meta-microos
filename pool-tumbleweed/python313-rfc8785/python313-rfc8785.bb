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

RPM_NAME = "python313-rfc8785-0.1.4-1.7.noarch.rpm"
RPM_HASH = "c8834795ca709d01971f76548b66930cf5d560de10d91fe3814333a3290fa788c55b0cfa4b916bbbd91b7d4969b22901f3f1df05162d146d610b5137cf9d652b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc8785 \
python3.13dist-rfc8785 \
python313-rfc8785 \
python3dist-rfc8785"

RDEPENDS:${PN} += "python-abi"

inherit rpm
