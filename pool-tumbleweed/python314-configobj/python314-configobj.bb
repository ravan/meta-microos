SUMMARY = "Config file reading, writing and validation"
DESCRIPTION = "ConfigObj is a simple but powerful config file reader and writer: an ini \
file round tripper. Its main feature is that it is very easy to use, with a \
straightforward programmer's interface and a simple syntax for config files. \
It has lots of other features though: \
 \
 * Nested sections (subsections), to any level \
 * List values \
 * Multiple line values \
 * Full Unicode support \
 * String interpolation (substitution) \
 * Integrated with a powerful validation system \
   - including automatic type checking/conversion \
   - and allowing default values \
   - repeated sections \
 * All comments in the file are preserved \
 * The order of keys/sections is preserved \
 * Powerful ``unrepr`` mode for storing/retrieving Python data-types"
LICENSE = "BSD-3-Clause"

PV = "5.0.9"

RPM_NAME = "python314-configobj-5.0.9-1.7.noarch.rpm"
RPM_HASH = "487c5e922a223c28359dc6e1d04bc7e4d2eeb5c473bcb6d83fa94d66c7593b879e3b8023b1633f904e7259c4c7d90b4cc5eb8b0929e29bd990632ab1ad825296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-configobj \
python314-configobj \
python3dist-configobj"

RDEPENDS:${PN} += "python-abi"

inherit rpm
