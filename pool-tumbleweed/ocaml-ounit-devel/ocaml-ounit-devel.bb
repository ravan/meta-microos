SUMMARY = "Development files for ocaml-ounit"
DESCRIPTION = "The ocaml-ounit-devel package contains libraries and signature files for \
developing applications that use ocaml-ounit."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-devel-2.2.7-3.1.aarch64.rpm"
RPM_HASH = "586a1df58ceb13d68a5dc16589fa77b01edb63f91f8f06df91cd85687c3b76c192393955cfd706f6a747fb81c2f5cc47b450dc1e15ad5b96cb68a31a41276a2a"

RPROVIDES:${PN} += "ocaml-OUnit \
ocaml-OUnit2 \
ocaml-OUnitAssert \
ocaml-OUnitBracket \
ocaml-OUnitCache \
ocaml-OUnitCheckEnv \
ocaml-OUnitChooser \
ocaml-OUnitConf \
ocaml-OUnitCore \
ocaml-OUnitDiff \
ocaml-OUnitLogger \
ocaml-OUnitLoggerCI \
ocaml-OUnitLoggerHTML \
ocaml-OUnitLoggerHTMLData \
ocaml-OUnitLoggerJUnit \
ocaml-OUnitLoggerStd \
ocaml-OUnitPlugin \
ocaml-OUnitPropList \
ocaml-OUnitResultSummary \
ocaml-OUnitRunner \
ocaml-OUnitRunnerProcesses \
ocaml-OUnitShared \
ocaml-OUnitState \
ocaml-OUnitTest \
ocaml-OUnitTestData \
ocaml-OUnitThreads \
ocaml-OUnitThreads-- \
ocaml-OUnitThreads--OUnitRunnerThreads \
ocaml-OUnitUtils \
ocaml-ounit-devel \
ocamlfind-oUnit \
ocamlfind-oUnit.advanced \
ocamlfind-oUnit.threads \
ocamlfind-ounit \
ocamlfind-ounit2 \
ocamlfind-ounit2.advanced \
ocamlfind-ounit2.threads \
ocamlx-OUnit \
ocamlx-OUnit2 \
ocamlx-OUnitAssert \
ocamlx-OUnitBracket \
ocamlx-OUnitCache \
ocamlx-OUnitCheckEnv \
ocamlx-OUnitChooser \
ocamlx-OUnitConf \
ocamlx-OUnitCore \
ocamlx-OUnitDiff \
ocamlx-OUnitLogger \
ocamlx-OUnitLoggerCI \
ocamlx-OUnitLoggerHTML \
ocamlx-OUnitLoggerHTMLData \
ocamlx-OUnitLoggerJUnit \
ocamlx-OUnitLoggerStd \
ocamlx-OUnitPlugin \
ocamlx-OUnitPropList \
ocamlx-OUnitResultSummary \
ocamlx-OUnitRunner \
ocamlx-OUnitRunnerProcesses \
ocamlx-OUnitShared \
ocamlx-OUnitState \
ocamlx-OUnitTest \
ocamlx-OUnitTestData \
ocamlx-OUnitThreads \
ocamlx-OUnitThreads-- \
ocamlx-OUnitThreads--OUnitRunnerThreads \
ocamlx-OUnitUtils"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalOO \
ocaml-Event \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Condition \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Mutex \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Oo \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Thread \
ocaml-Unix \
ocaml-ounit \
ocamlfind-ounit2 \
ocamlfind-ounit2.advanced \
ocamlfind-ounit2.threads \
ocamlfind-seq \
ocamlfind-threads \
ocamlfind-unix \
ocamlx-CamlinternalOO \
ocamlx-Event \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Condition \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Mutex \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Thread \
ocamlx-Unix"

inherit rpm
