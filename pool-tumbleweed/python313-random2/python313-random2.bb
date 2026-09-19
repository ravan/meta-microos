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

RPM_NAME = "python313-random2-1.0.2-1.9.noarch.rpm"
RPM_HASH = "9be6fbc282b9ff54f56cd3b20bdd200d7f9dd6da470a94dc6da0c322d961d248b08d1da67108e36ff2558d0bf3e11b5f9a6a47c3aa5a626296f2f3c3edab5c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-random2 \
python3.13dist-random2 \
python313-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
