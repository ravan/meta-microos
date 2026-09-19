SUMMARY = "Samples of code written in Brainfuck"
DESCRIPTION = "Some examples of programs written in Brainfuck."
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "bff-samples-1.0.7-1.12.noarch.rpm"
RPM_HASH = "ac7f8c3fbf66fc09d5cf31781be2a7d436579ee74d0523fae00f8cfe61dc49230c49522ba59f8006d4cad2e447df0ffb8be89383e0c7566acdc002f7d5de02a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bff-samples"

RDEPENDS:${PN} += ""

inherit rpm
