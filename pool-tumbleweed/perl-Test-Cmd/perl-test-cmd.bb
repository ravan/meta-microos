SUMMARY = "Perl module for portable testing of commands and scripts"
DESCRIPTION = "The 'Test::Cmd' module provides a low-level framework for portable \
automated testing of executable commands and scripts (in any language, not \
just Perl), especially commands and scripts that interact with the file \
system. \
 \
The 'Test::Cmd' module makes no assumptions about what constitutes a \
successful or failed test. Attempting to read a file that doesn't exist, \
for example, may or may not be an error, depending on the software being \
tested. \
 \
Consequently, no 'Test::Cmd' methods (including the 'new()' method) exit, \
die or throw any other sorts of exceptions (but they all do return useful \
error indications). Exceptions or other error status should be handled by a \
higher layer: a subclass of the Test::Cmd manpage, or another testing \
framework such as the the Test manpage or the Test::Simple manpage Perl \
modules, or by the test itself. \
 \
(That said, see the the Test::Cmd::Common manpage module if you want a \
similar module that provides exception handling, either to use directly in \
your own tests, or as an example of how to use 'Test::Cmd'.) \
 \
In addition to running tests and evaluating conditions, the 'Test::Cmd' \
module manages and cleans up one or more temporary workspace directories, \
and provides methods for creating files and directories in those workspace \
directories from in-line data (that is, here-documents), allowing tests to \
be completely self-contained. When used in conjunction with another testing \
framework, the 'Test::Cmd' module can function as a _fixture_ (common \
startup code for multiple tests) for simple management of command execution \
and temporary workspaces. \
 \
The 'Test::Cmd' module inherits the File::Spec manpage methods \
('file_name_is_absolute()', 'catfile()', etc.) to support writing tests \
portably across a variety of operating and file systems. \
 \
A 'Test::Cmd' environment object is created via the usual invocation: \
 \
    $test = Test::Cmd->new(); \
 \
Arguments to the 'Test::Cmd::new' method are keyword-value pairs that may \
be used to initialize the object, typically by invoking the same-named \
method as the keyword."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-Test-Cmd-1.09-1.12.noarch.rpm"
RPM_HASH = "ad272967c2affc91c41eb9d75df3994f6c50d8ccd9b6b7bdda2dcd5687754424d8a10847aa57264e99812b12ffd1ba17c846f558319e1a3d07d993f838c8bb33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Cmd \
perl-Test--Cmd--Common \
perl-Test-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
