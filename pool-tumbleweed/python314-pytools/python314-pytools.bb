SUMMARY = "A collection of tools for Python"
DESCRIPTION = "Pytools is a big bag of things that are 'missing' from the Python standard library. \
This is mainly a dependency of other software packages (pycuda, pyopencl, etc ), \
and is probably of little interest to you unless you use those. If you're curious \
nonetheless, here's what's on offer: \
* A ton of small tool functions such as len_iterable, argmin, tuple generation, \
  permutation generation, ASCII table pretty printing, GvR's mokeypatch_xxx() hack, \
  the elusive flatten, and much more. \
* Michele Simionato's decorator module \
* A time-series logging module, pytools.log. \
* Batch job submission, pytools.batchjob. \
* A lexer, pytools.lex."
LICENSE = "MIT"

PV = "2026.1.1"

RPM_NAME = "python314-pytools-2026.1.1-1.3.noarch.rpm"
RPM_HASH = "f11cb1bf0a7576f499b99b2d9dcecab8973dc67d5d8e19bd13e739be32d48bae7ddc7bd6332075660435c5875232b38595eca792ebc74d689b68f695db2e4905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytools \
python314-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python314-platformdirs \
python314-siphash24 \
python314-typing-extensions"

inherit rpm
