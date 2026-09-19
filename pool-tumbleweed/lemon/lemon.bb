SUMMARY = "A parser generator"
DESCRIPTION = "Lemon is an LALR(1) parser generator for C or C++. It does the same \
job as bison and yacc. But lemon is not another bison or yacc \
clone. It uses a different grammar syntax which is designed to reduce \
the number of coding errors. Lemon also uses a more sophisticated \
parsing engine that is faster than yacc and bison and which is both \
reentrant and thread-safe. Furthermore, Lemon implements features \
that can be used to eliminate resource leaks, making is suitable for \
use in long-running programs such as graphical user interfaces or \
embedded controllers."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "lemon-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "e826b5c584fb25961d736b2e1daaf1fc24830f547ed11bd4af7cee711ffbd02aa9edcc6d4e39a58e70263d52dc38348a423e94868b810b670180b76deb953ceb"

RPROVIDES:${PN} += "lemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
