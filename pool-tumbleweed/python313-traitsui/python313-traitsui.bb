SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The TraitsGUI project contains a toolkit-independent GUI abstraction layer \
(known as Pyface), which is used to support the 'visualization' features of \
the Traits package. Thus, you can write code in terms of the Traits API \
(views, items, editors, etc.), and let TraitsGUI and your selected toolkit \
and back-end take care of the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only"

PV = "8.0.0"

RPM_NAME = "python313-traitsui-8.0.0-1.12.noarch.rpm"
RPM_HASH = "0c8dc71b259578664f7f7d3264fbccad053a1ea4a15dfe8cc4fbd95ec0b4efff2223bfd66c2f8e11a6b72e1db42633367a1baa38529d1a1035b2034dcb572d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitsui \
python3.13dist-traitsui \
python313-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python313-pyface \
python313-traits"

inherit rpm
