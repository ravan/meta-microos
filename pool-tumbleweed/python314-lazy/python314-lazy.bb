SUMMARY = "Lazy attributes for Python objects"
DESCRIPTION = "Lazy attributes are computed attributes that are evaluated only once, \
the first time they are used. Subsequent uses return the results of \
the first call. They come handy when code should run \
 * late, i.e. just before it is needed, and \
 * once, i.e. not twice, in the lifetime of an object. \
You can think of it as deferred initialization. The possibilities are \
endless."
LICENSE = "BSD-2-Clause"

PV = "2.0"

RPM_NAME = "python314-lazy-2.0-1.1.noarch.rpm"
RPM_HASH = "e399b06ed74a887013e74b8aa50c4a251925237c454d1ede49f2022fce8c6f408cc6139108a72b30f9b4d9460ff035c7a9b8d58a5d793e037e368e62033e2e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazy \
python314-lazy \
python3dist-lazy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
