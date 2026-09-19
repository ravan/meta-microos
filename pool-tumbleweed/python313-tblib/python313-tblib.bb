SUMMARY = "Traceback serialization library"
DESCRIPTION = "Traceback serialization library. \
 \
It allows you to: \
 \
* Pickle  tracebacks and raise exceptions with pickled tracebacks in \
  different processes. This allows better error handling when running \
  code over multiple processes (imagine multiprocessing, billiard, \
  futures, celery etc). \
* Create traceback objects from strings (the ``from_string`` method). \
  *No pickling is used*. \
* Serialize tracebacks to/from plain dicts (the ``from_dict`` and \
  ``to_dict`` methods). *No pickling is used*. \
* Raise the tracebacks created from the aforementioned sources. \
 \
Again, note that using the pickle support is completely optional. You \
are solely responsible for security problems should you decide to use \
the pickle support."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python313-tblib-3.2.2-1.4.noarch.rpm"
RPM_HASH = "7df23d367bb508467c837f6c34f43b4adbcff583f046807bcf74af063d500427a1cae3ba1474e39c94a06a8434e8f33fa605d8899bce43bf0cae43ee6a584b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tblib \
python3.13dist-tblib \
python313-tblib \
python3dist-tblib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
