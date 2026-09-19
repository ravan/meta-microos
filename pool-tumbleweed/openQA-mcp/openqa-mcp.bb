SUMMARY = "Additional MCP package for AI support in openQA"
DESCRIPTION = "This package contains a plugin for AI support in openQA."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-mcp-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "44cd4f90be65ca2af27a0943bcf27d36d7afc491dddecf266510bf98681a69b2afeb9a4098b170e1b32d86491eb66ef5834108df95880543de51c82fdbd02076"

RPROVIDES:${PN} += "openQA-mcp \
perl-OpenQA--WebAPI--Plugin--MCP"

RDEPENDS:${PN} += "perl-MCP"

inherit rpm
