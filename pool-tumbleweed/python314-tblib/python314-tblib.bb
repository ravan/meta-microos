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

RPM_NAME = "python314-tblib-3.2.2-1.4.noarch.rpm"
RPM_HASH = "304ffd1a3e3eba00d02ef3ce2a5787f54d43ec9f1b7ce37598dccef0d01a99582034dc689f55863172ca4348f0c06288ca89c15511c79475e13fa241b2a06d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tblib \
python314-tblib \
python3dist-tblib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
