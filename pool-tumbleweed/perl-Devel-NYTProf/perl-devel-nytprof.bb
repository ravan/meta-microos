SUMMARY = "Powerful fast feature-rich Perl source code profiler"
DESCRIPTION = "Devel::NYTProf is a powerful, fast, feature-rich perl source code profiler. \
 \
  * Performs per-line statement profiling for fine detail \
 \
  * Performs per-subroutine statement profiling for overview \
 \
  * Performs per-opcode profiling for slow perl builtins \
 \
  * Performs per-block statement profiling (the first profiler to do so) \
 \
  * Accounts correctly for time spent after calls return \
 \
  * Performs inclusive and exclusive timing of subroutines \
 \
  * Subroutine times are per calling location (a powerful feature) \
 \
  * Can profile compile-time activity, just run-time, or just END time \
 \
  * Uses novel techniques for efficient profiling \
 \
  * Sub-microsecond (100ns) resolution on supported systems \
 \
  * Very fast - the fastest statement and subroutine profilers for perl \
 \
  * Handles applications that fork, with no performance cost \
 \
  * Immune from noise caused by profiling overheads and I/O \
 \
  * Program being profiled can stop/start the profiler \
 \
  * Generates richly annotated and cross-linked html reports \
 \
  * Captures source code, including string evals, for stable results \
 \
  * Trivial to use with mod_perl - add one line to httpd.conf \
 \
  * Includes an extensive test suite \
 \
  * Tested on very large codebases \
 \
NYTProf is effectively two profilers in one: a statement profiler, and a \
subroutine profiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.150.0"

RPM_NAME = "perl-Devel-NYTProf-6.150.0-1.5.aarch64.rpm"
RPM_HASH = "def393ef872fb91e0ecc6f68e8511a4c852edcafd9203cc63feb99220be7741ceb2df5cb72b49fa6b6c9a2392be5f985e00546bb7a0bcdc1c407b1f921bf174b"

RPROVIDES:${PN} += "perl-Devel--NYTProf \
perl-Devel--NYTProf--Apache \
perl-Devel--NYTProf--Constants \
perl-Devel--NYTProf--Core \
perl-Devel--NYTProf--Data \
perl-Devel--NYTProf--FileHandle \
perl-Devel--NYTProf--FileInfo \
perl-Devel--NYTProf--ReadStream \
perl-Devel--NYTProf--Reader \
perl-Devel--NYTProf--Run \
perl-Devel--NYTProf--SubCallInfo \
perl-Devel--NYTProf--SubInfo \
perl-Devel--NYTProf--Util \
perl-Devel-NYTProf"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-JSON--MaybeXS"

inherit rpm
