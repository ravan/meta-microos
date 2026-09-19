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

RPM_NAME = "python313-pytools-2026.1.1-1.3.noarch.rpm"
RPM_HASH = "08a630b53605eeff7f48edcfb7226497a672dc3f2d17e91c665f108503a56de7d9fa1542789b1126e254c61087f7af89d22cf1b0a1c976e3768ab7e99a3000c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytools \
python3.13dist-pytools \
python313-pytools \
python3dist-pytools"

RDEPENDS:${PN} += "python-abi \
python313-platformdirs \
python313-siphash24 \
python313-typing-extensions"

inherit rpm
