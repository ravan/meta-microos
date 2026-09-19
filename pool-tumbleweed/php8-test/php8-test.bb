SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-test-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "5604814f5812c7ee4b6e58b5216ac15db0cbc5b1c8e4ee4937bc54a755e5d091198bb27571d7c0903629baa140a5df362e486ea1648e1c2dd677a5e4aa67c03a"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
