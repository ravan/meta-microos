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

RPM_NAME = "python313-lazy-2.0-1.1.noarch.rpm"
RPM_HASH = "ed692992df345358293c43f934c31a0dd4de508e50c6dd60f51fd9034a7246f9c9897681ba9f9d85cccc380e1a5588d5ea41afa7d546b1179f7be48cb39b16d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy \
python3.13dist-lazy \
python313-lazy \
python3dist-lazy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
