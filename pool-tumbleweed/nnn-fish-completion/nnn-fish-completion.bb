SUMMARY = "Fish Completion for nnn"
DESCRIPTION = "The official fish completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "5.2"

RPM_NAME = "nnn-fish-completion-5.2-1.3.noarch.rpm"
RPM_HASH = "374f1374470ef4f209988566f2665da8fc7f3a3cabd67b5548fb851900c905cdb87b5838041bbbf722b9c562d5914cc2750c97df8229c1a667c0a24b615d5c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
