SUMMARY = "A ProcessBuilder look-alike based entirely on native POSIX APIs"
DESCRIPTION = "The jnr-process library provides a drop-in replacement for the JDK \
ProcessBuilder API, but instead of a thread-pumped shim it is a direct \
abstraction around the posix_spawn C API and provides selectable in, out, and \
err channels."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-0.4.12-3.3.noarch.rpm"
RPM_HASH = "10353ac6fa6b4092f44650c0b717e6fad0064569905dd68099bac4c76271625000ce5d4cda24ff7a65edb07d41022b7dfa4baae29600cb9561233fab6b7bc88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-process \
mvn-com.github.jnr-jnr-process \
mvn-com.github.jnr-jnr-process-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-posix"

inherit rpm
