SUMMARY = "Backport of PEP 654 (exception groups)"
DESCRIPTION = "This is a backport of the ``BaseExceptionGroup`` and ``ExceptionGroup`` classes from \
Python 3.11. \
 \
It contains the following: \
 \
* The  ``exceptiongroup.BaseExceptionGroup`` and ``exceptiongroup.ExceptionGroup`` \
  classes \
* A utility function (``exceptiongroup.catch()``) for catching exceptions possibly \
  nested in an exception group \
* Patches to the ``TracebackException`` class that properly formats exception groups \
  (installed on import) \
* An exception hook that handles formatting of exception groups through \
  ``TracebackException`` (installed on import) \
* Special versions of some of the functions from the ``traceback`` module, modified to \
  correctly handle exception groups even when monkey patching is disabled, or blocked by \
  another custom exception hook: \
 \
  * ``traceback.format_exception()`` \
  * ``traceback.format_exception_only()`` \
  * ``traceback.print_exception()`` \
  * ``traceback.print_exc()`` \
 \
If this package is imported on Python 3.11 or later, the built-in implementations of the \
exception group classes are used instead, ``TracebackException`` is not monkey patched \
and the exception hook won't be installed."
LICENSE = "MIT & Python-2.0"

PV = "1.3.1"

RPM_NAME = "python314-exceptiongroup-1.3.1-1.5.noarch.rpm"
RPM_HASH = "f9461fce42344e81247190595de80ffc1d2eeae6809be960c6db737d04f04461368b35e3e9f95cc88db3bc4652eef5cde1b207dc50800c244e5cba01c15fabe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-exceptiongroup \
python314-exceptiongroup \
python3dist-exceptiongroup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
