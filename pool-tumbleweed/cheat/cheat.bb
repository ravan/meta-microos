SUMMARY = "Allows you to create and view interactive cheatsheets on the command-line"
DESCRIPTION = "cheat allows you to create and view interactive cheatsheets on the command-line. It was designed to help remind *nix system administrators of options for commands that they use frequently, but not frequently enough to remember."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "cheat-5.1.0-2.3.aarch64.rpm"
RPM_HASH = "a87ecafbf52cf24872d327c0352afb9de4ec97b0a8a25d4cb86b1b36828ff9d1141f3dc8d097587c1933f6e0185231aaa8a6a228f48741f0b2c951330b4f5685"

RPROVIDES:${PN} += "cheat"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
