SUMMARY = "CLI tool for release engineering in Go, Rust, Zig and TypeScript"
DESCRIPTION = "CLI tool that provides a single command to build, archive, package, sign and publish artifacts."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "goreleaser-2.18.1-1.1.aarch64.rpm"
RPM_HASH = "7557a9eaeabce8a8b0f9ae714247018b1fa4069a2cbc5daa7eba34c0f0a1689036c0607754bf8a73d546065a0dee08a9045a8b1ae92053d06a40e5cd7cf54dcb"

RPROVIDES:${PN} += "goreleaser"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
