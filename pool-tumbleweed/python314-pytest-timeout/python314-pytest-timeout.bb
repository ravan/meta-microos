SUMMARY = "Pytest plugin to abort hanging tests"
DESCRIPTION = "This is a plugin which will terminate tests after a certain timeout. \
When doing so it will show a stack dump of all threads running at the \
time.  This is useful when running tests under a continuous \
integration server or simply if you don't know why the test suite \
hangs. \
 \
Note that while by default on POSIX systems pytest will continue to \
execute the tests after a test has timed, out this is not always \
possible.  Often the only sure way to interrupt a hanging test is by \
terminating the entire process.  As this is a hard termination \
(``os._exit()``) it will result in no teardown, JUnit XML output etc. \
But the plugin will ensure you will have the debugging output on \
stderr nevertheless, which is the most important part at this stage."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-pytest-timeout-2.4.0-1.5.noarch.rpm"
RPM_HASH = "178432c7dc10b9aaba0d73096ad038d7e28dc16483e8a005918bb9bb46ffcae535062d4f7ab95512126d3641a1024dcd5288eb9163807cf267bfe6eab08efe27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-timeout \
python314-pytest-timeout \
python3dist-pytest-timeout"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
