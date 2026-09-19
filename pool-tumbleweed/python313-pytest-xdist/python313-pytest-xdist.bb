SUMMARY = "Distributed testing and loop-on-failing for py.test"
DESCRIPTION = "The `pytest-xdist`_ plugin extends py.test with some unique \
test execution modes: \
 \
* test run parallelization_: if you have multiple CPUs or hosts you can use \
  those for a combined test run.  This allows to speed up \
  development or to use special resources of `remote machines`_. \
 \
* ``--boxed``: (not available on Windows) run each test in a boxed_ \
  subprocess to survive ``SEGFAULTS`` or otherwise dying processes \
 \
* ``--looponfail``: run your tests repeatedly in a subprocess.  After each run \
  py.test waits until a file in your project changes and then re-runs \
  the previously failing tests.  This is repeated until all tests pass \
  after which again a full run is performed. \
 \
* `Multi-Platform`_ coverage: you can specify different Python interpreters \
  or different platforms and run tests in parallel on all of them. \
 \
Before running tests remotely, ``py.test`` efficiently 'rsyncs' your \
program source code to the remote place.  All test results \
are reported back and displayed to your local terminal. \
You may specify different Python versions and interpreters."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "python313-pytest-xdist-3.8.0-2.5.noarch.rpm"
RPM_HASH = "e59ab939488e118c3367218f8d1373f54a3e51ea04b4c648116eece6e15d11aab53cad7cf892e13790b8cc6ffcd4423c8c66c7c55c4ca1a18142ad3457dc5e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xdist \
python3.13dist-pytest-xdist \
python313-pytest-xdist \
python3dist-pytest-xdist"

RDEPENDS:${PN} += "python-abi \
python313-execnet \
python313-pytest"

inherit rpm
