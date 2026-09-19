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

RPM_NAME = "python313-exceptiongroup-1.3.1-1.5.noarch.rpm"
RPM_HASH = "80d0aade694ad1cdfa6186064197b0c23fcaee580a30d771ce56124808e0e68b2e74d7f4a2726a1dd28177b6544ee6d46b76a6f24e35ab5656678d019b5484b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exceptiongroup \
python3.13dist-exceptiongroup \
python313-exceptiongroup \
python3dist-exceptiongroup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
