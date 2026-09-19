SUMMARY = "CLI tool to report known CVE vulnerabilities in Go source code and binaries"
DESCRIPTION = "govulncheck is a CLI tool to report known vulnerabilities that affect Go code. It uses static analysis of source code or a binary's symbol table to narrow down reports to only those that could affect the application. \
 \
By default, govulncheck makes requests to the Go vulnerability database at https://vuln.go.dev. Requests to the vulnerability database contain only module paths, not code or other properties of your program. See https://vuln.go.dev/privacy.html for more. Use the -db flag to specify a different database, which must implement the specification at https://go.dev/security/vuln/database."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "govulncheck-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "6673ed3625ec9a31b76b56a1b1d92838b95cea38008b38182459dbf00c3f7adf025a4a078a6dfb04ac277863f2cc99adc6ffe6c40bef345966ba97b4037425b6"

RPROVIDES:${PN} += "govulncheck"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
