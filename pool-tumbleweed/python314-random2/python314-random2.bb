SUMMARY = "A Session and Caching library with WSGI Middleware"
DESCRIPTION = "This package provides a Python 3 ported version of Python 2.7's random module. \
It has also been back-ported to work in Python 2.6. \
 \
In Python 3, the implementation of randrange() was changed, so that even with \
the same seed you get different sequences in Python 2 and 3. Note that several \
high-level functions such as randint() and choice() use randrange(). \
 \
In my testing code I heavily rely on stable random generator results and it \
makes porting code to Python 3 a lot harder, if all those tests have to be \
adjusted. This package fixes that."
LICENSE = "Python-2.0"

PV = "1.0.2"

RPM_NAME = "python314-random2-1.0.2-1.9.noarch.rpm"
RPM_HASH = "19f8712b57a0ce8ecf5fd64e0190294b93529451abe94f90a98dc2605c293fb8aed9f01fed9b538333cd296ed409f77d9beed9ff3a3c31be8ad28d0545e54bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-random2 \
python314-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
