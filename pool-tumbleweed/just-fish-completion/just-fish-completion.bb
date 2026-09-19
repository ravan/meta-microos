SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.58.0"

RPM_NAME = "just-fish-completion-1.58.0-1.2.noarch.rpm"
RPM_HASH = "0a41d2644ba6a636ac63d4fe38def1c522d846ebb20a5a94366b0e80ac818271bcff5649e1315352cc76e89c0eccf9c526db3fff0e02a3749beba787d1c585b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
