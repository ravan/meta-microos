SUMMARY = "Cross-platform colored terminal text"
DESCRIPTION = "Makes ANSI escape character sequences, for producing colored terminal text and \
cursor positioning, work under MS Windows. \
 \
ANSI escape character sequences have long been used to produce colored terminal \
text and cursor positioning on Unix and Macs. Colorama makes this work on \
Windows, too. It also provides some shortcuts to help generate ANSI sequences, \
and works fine in conjunction with any other ANSI sequence generation library, \
such as Termcolor. \
 \
This has the upshot of providing a simple cross-platform API for printing \
colored terminal text from Python, and has the happy side-effect that existing \
applications or libraries which use ANSI sequences to produce colored output on \
Linux or Macs can now also work on Windows, simply by calling colorama.init()."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "python313-colorama-0.4.6-2.15.noarch.rpm"
RPM_HASH = "b594e27e95d339e655d93c31015fc1b0f312b9b254f610ea0c0e90d6e1c30120e527f5fb37f53a6c450285249189e7626b5b418e93d58b9e20300f1675f98965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorama \
python3.13dist-colorama \
python313-colorama \
python3dist-colorama"

RDEPENDS:${PN} += "python-abi"

inherit rpm
