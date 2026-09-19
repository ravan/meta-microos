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

RPM_NAME = "python313-pytest-timeout-2.4.0-1.5.noarch.rpm"
RPM_HASH = "b276f37805d864a740aa7dd832bfe467a24f873d358523429269130b13a2e7e808000bee52357aff3cd8572ede01dd9ed3430fe864658796a81cc4b02841ce67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-timeout \
python3.13dist-pytest-timeout \
python313-pytest-timeout \
python3dist-pytest-timeout"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
