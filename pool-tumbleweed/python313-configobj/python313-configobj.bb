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

RPM_NAME = "python313-configobj-5.0.9-1.7.noarch.rpm"
RPM_HASH = "22fd04f5d2352a6592cea8661a804286489addc6a8b5c7085e01d4899419411101a5722ca909cccc9d920d2ee808a1c033b7c9aac6e9b5bc68d27d91d93de15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configobj \
python3.13dist-configobj \
python313-configobj \
python3dist-configobj"

RDEPENDS:${PN} += "python-abi"

inherit rpm
