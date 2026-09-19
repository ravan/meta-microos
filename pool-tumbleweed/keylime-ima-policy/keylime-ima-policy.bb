SUMMARY = "IMA policy for Keylime agent"
DESCRIPTION = "Subpackage of rust-keylime to provide an suggested IMA policy for Keylime agent"
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-3-Clause & ISC & MIT"

PV = "0.2.9+49"

RPM_NAME = "keylime-ima-policy-0.2.9+49-1.3.aarch64.rpm"
RPM_HASH = "084ef5e586f703c319f2661663ae825ed04cbc2883f6b185b41274eeb8a992c4d7168e459cda873494ab543b51f23966810571593cffdc75593baa27bde94d92"

RPROVIDES:${PN} += "config-keylime-ima-policy \
keylime-ima-policy"

RDEPENDS:${PN} += ""

inherit rpm
