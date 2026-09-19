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

RPM_NAME = "python314-pytest-randomly-4.1.0-1.1.noarch.rpm"
RPM_HASH = "c755d0db7b3a72cee77274aa6187573dedce883b827317f7646b2b2efb72aa60330a4436aa3e238f198041a1f5979bff3129be7bcdea6e0c8c221a461b20444c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-randomly \
python314-pytest-randomly \
python3dist-pytest-randomly"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
