SUMMARY = "Vulnerability scanner written in Go"
DESCRIPTION = "Use OSV-Scanner to find existing vulnerabilities affecting your project's \
dependencies. \
 \
OSV-Scanner provides an officially supported frontend to the OSV database that \
connects a project’s list of dependencies with the vulnerabilities that affect \
them. Since the OSV.dev database is open source and distributed, it has several \
benefits in comparison with closed source advisory databases and scanners: \
 \
- Each advisory comes from an open and authoritative source (e.g. the RustSec \
  Advisory Database) \
- Anyone can suggest improvements to advisories, resulting in a very high \
  quality database \
- The OSV format unambiguously stores information about affected versions in a \
  machine-readable format that precisely maps onto a developer’s list of packages \
 \
The above all results in fewer, more actionable vulnerability notifications, \
which reduces the time needed to resolve them."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "osv-scanner-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "c7aba341806e91a54968b3fcdbfe2775c0c811740ba09ab046943db534331b7ddfa5d2ad8f0fd7a479585ea8941ea6c191100b42204e1240d971c6c99874c5e8"

RPROVIDES:${PN} += "osv-scanner"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
