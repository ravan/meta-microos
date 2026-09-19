SUMMARY = "Print out each line before it is executed (like sh -x)"
DESCRIPTION = "If you run your program with 'perl -d:Trace program', this module will \
print a message to standard error just before each line is executed. For \
example, if your program looks like this: \
 \
         \
 \
 \
        print 'Statement 1 at line 4\\n'; \
        print 'Statement 2 at line 5\\n'; \
        print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
 \
        exit 0; \
 \
 \
        sub x { \
          print 'In sub x at line 12.\\n'; \
          return 13; \
        } \
 \
Then the 'Trace' output will look like this: \
 \
        >> ./test:4: print 'Statement 1 at line 4\\n'; \
        >> ./test:5: print 'Statement 2 at line 5\\n'; \
        >> ./test:6: print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
        >> ./test:12:   print 'In sub x at line 12.\\n'; \
        >> ./test:13:   return 13; \
        >> ./test:8: exit 0; \
 \
This is something like the shell's '-x' option."
LICENSE = "SUSE-Public-Domain"

PV = "0.120.0"

RPM_NAME = "perl-Devel-Trace-0.120.0-1.7.noarch.rpm"
RPM_HASH = "f6c4e6d706cfe4416af13c075622c7966a55aaf7159e9b8dd7c708b620b702dbba3f1918733873472204dd3b9503dc18212d87d4d3a0d71925c5644fb8bd4bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Trace \
perl-Devel-Trace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
