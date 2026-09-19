SUMMARY = "Pytest plugin to randomly order tests and control random.seed"
DESCRIPTION = "Pytest plugin to randomly order tests and control random.seed. \
 \
Features: \
   * Randomly shuffles the order of test items. This is done first at \
     the level of modules, then at the level of test classes (if you \
     have them), then at the order of functions. This also works with \
     things like doctests. \
   * Resets random.seed() at the start of every test case and test to \
     fixed number - this defaults to time.time() from the start of \
     your test run, but you can pass in --randomly-seed to repeat a \
     randomness-induced failure. \
   * If factory boy is installed, its random state is reset at the \
     start of every test. This allows for repeatable use of its random \
     'fuzzy' features. \
   * If faker is installed, its random state is reset at the start of \
     every test. This is also for repeatable fuzzy data in tests. \
   * If numpy is installed, its random state is reset at the start of \
     every test."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-pytest-randomly-4.1.0-1.1.noarch.rpm"
RPM_HASH = "70a5eede3426ee63d681338fd1961ca46b14cbb01a1d0505ca9781cb136de4c41ea67ee29c4acc45174748f1724e0be4d4c0bd2a88d4cbaeecb56dc38aaa8abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-randomly \
python3.13dist-pytest-randomly \
python313-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
